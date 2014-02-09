package client.model;

import java.util.ArrayList;

public class Board {

	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	public Board() {
		
	}
	
	public void addPiece(Piece piece)
	{
		pieces.add(piece);
	}
	
	public void movePiece(Piece piece, int place)
	{
		for (Piece p : pieces) {
			if(p.equals(piece))
			{
				p.place.setPlace(place);
				break;
			}
		}
	}
	
	public void killPiece(Piece piece)
	{
		pieces.remove(piece);
	}
	
	public ArrayList<Piece> getPieces()
	{
		return pieces;
	}

}
