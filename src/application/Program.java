package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());


		/* 
		TESTES feito mudando os métodos de protect para public
		Position testePosition = new Position(4, 7);
		System.out.println("Posição do sistema: " + testePosition);

		ChessPosition testePositionChess = new ChessPosition('a', 7);
		testePositionChess =  ChessPosition.fromPosition(testePosition);
		System.out.println("Posição do xadrez: " + testePositionChess);

		testePosition = testePositionChess.toPosition();
		System.out.println("Posição do sistema pós conversão: " + testePosition);
		*/
	}
}
