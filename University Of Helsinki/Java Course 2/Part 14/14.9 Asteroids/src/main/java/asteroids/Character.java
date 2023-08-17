package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public abstract class Character {
    
    private Polygon character;
    private Point2D movement; 
    private boolean alive;

    
    public Character(Polygon polygon, int x, int y) {
        
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        
        this.movement = new Point2D(0, 0);
        this.alive = true;
        
    }//end constructor
    
    public Polygon getCharacter() {
        
        return character;
        
    }//end getCharacter
    
    public void turnLeft() {
        
        this.character.setRotate(this.character.getRotate() - 5);
        
    }//end turnLeft
    
    public void turnRight() {
        
        this.character.setRotate(this.character.getRotate() + 5);
        
    }//end turnRight
    
    public void move() {
        
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());
        
        if (this.character.getTranslateX() < 0) {
            
            this.character.setTranslateX(this.character.getTranslateX() + 
                    AsteroidsApplication.WIDTH);
            
        }//end if

        if (this.character.getTranslateX() > AsteroidsApplication.WIDTH) {
            
            this.character.setTranslateX(this.character.getTranslateX() %
                    AsteroidsApplication.WIDTH);
            
        }//end if

        if (this.character.getTranslateY() < 0) {
            
            this.character.setTranslateY(this.character.getTranslateY() + 
                    AsteroidsApplication.HEIGHT);
            
        }//end if

        if (this.character.getTranslateY() > AsteroidsApplication.HEIGHT) {
            
            this.character.setTranslateY(this.character.getTranslateY() %
                    AsteroidsApplication.HEIGHT);
            
        }//end if
        
    }//end move
    
    public void accelerate() {
        
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));

        changeX *= 0.05;
        changeY *= 0.05;
        
        this.movement = this.movement.add(changeX, changeY);
        
    }//end accelerate
    
    public boolean collide(Character other) {
        
        Shape collisionArea = Shape.intersect(this.character, other.getCharacter());
        return collisionArea.getBoundsInLocal().getWidth() != -1;
        
    }//end collide

    public Point2D getMovement() {
        
        return movement;
        
    }//end getMovement

    public void setMovement(Point2D movement) {
        
        this.movement = movement;
        
    }//end setmovement
    
    public boolean isAlive() {
        
        return alive;
        
    }//end isAlive

    public void setAlive(boolean alive) {
        
        this.alive = alive;
        
    }//end setAlive
    
}//end class