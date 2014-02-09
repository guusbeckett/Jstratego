package client.model;

public class Piece {
	
	Place place;
	CLASS classPiece;
	boolean isEnemy;
	public enum CLASS{
		MARSHAL, GENERAL, COLONEL, MAJOR, CAPTAIN, LIEUTENTANT, SERGEANT, MINER, SCOUT, SPY, BOMB, FLAG
	}
	
	public Piece(int placePiece, CLASS classPiece, boolean isEnemyPiece)
	{
		isEnemy = isEnemyPiece;
		this.classPiece = classPiece;
		place = new Place(placePiece);
	}

}
