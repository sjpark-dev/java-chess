package chess.domain.game.state;

import chess.domain.board.Board;

public class End extends Finished {
    public End(Board board) {
        super(board);
    }

    @Override
    public State start() {
        throw new IllegalStateException("게임이 이미 종료되었습니다.");
    }
}