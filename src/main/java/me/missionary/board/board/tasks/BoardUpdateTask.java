package me.missionary.board.board.tasks;

import lombok.RequiredArgsConstructor;
import me.missionary.board.BoardManager;
import me.missionary.board.board.Board;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.UUID;
import java.util.function.Predicate;

/**
 * @author Missionary (missionarymc@gmail.com)
 * @since 5/31/2018
 */
public class BoardUpdateTask extends BukkitRunnable {

    private static final Predicate<UUID> PLAYER_IS_ONLINE = uuid -> Bukkit.getPlayer(uuid) != null;

    private final BoardManager boardManager;

    public BoardUpdateTask(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    @Override
    public void run() {
        boardManager.getScoreboards().entrySet().stream().filter(entrySet -> PLAYER_IS_ONLINE.test(entrySet.getKey())).forEach(entrySet -> entrySet.getValue().update());
    }
}
