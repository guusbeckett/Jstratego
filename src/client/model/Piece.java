package client.model;

public class Piece {
	
<<<<<<< HEAD
	public Piece()
	{
		
=======
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
>>>>>>> eec38051a52776cf5d3576d750ffa0292174858b
	}

}
