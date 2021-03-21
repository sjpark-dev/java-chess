package chess.domain.movestrategy;

import chess.domain.board.Board;
import chess.domain.board.position.Position;

import java.util.Set;

public interface MoveStrategy {
    Set<Position> movable(Board board, Position source);
}
