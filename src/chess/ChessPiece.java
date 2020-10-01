package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return this.moveCount;
	}
	
	public void increaseMoveCount() {
		this.moveCount++;
	}
	
	public void decreaseMoveCount() {
		this.moveCount--;
	}
	
	public ChessPosition getChessPosition() {
		// O método é estático, então eu posso executar uma chamada da forma abaixo
		return ChessPosition.fromPosition(this.position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != this.color;
	}
	
}
