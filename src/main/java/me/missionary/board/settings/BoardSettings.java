package me.missionary.board.settings;

import me.missionary.board.provider.BoardProvider;

/**
 * @author Missionary (missionarymc@gmail.com)
 * @since 5/31/2018
 */
public class BoardSettings {

    private BoardProvider boardProvider;

    private ScoreDirection scoreDirection;

    public BoardSettings(BoardProvider boardProvider, ScoreDirection scoreDirection) {
        this.boardProvider = boardProvider;
        this.scoreDirection = scoreDirection;
    }

    public BoardProvider getBoardProvider() {
        return boardProvider;
    }

    public ScoreDirection getScoreDirection() {
        return scoreDirection;
    }
}
