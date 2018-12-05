
size(1250, 850);
background(140, 379, 80); 


fill(12, 7, 105);
stroke(173, 37, 28);
ellipse(550, 550, 30 , 30);

int birdYVelocity = 30;

int gravity = 1;

fill(red, green, blue);
rect(x, y, width, height);

int upperPipeHeight = (int) random(100, 400);

fill(red, green, blue);
rect(x, y, width, height);

lowerY = upperY + upperPipeHeight + pipeGap;

boolean intersectsPipes() { 
     if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
          return true; }
     else if (birdY>lowerPipeTop && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
          return true; }
     else { return false; }
}

text(text, xPosition, yPosition);

import ddf.minim.*;
Minim minim;  
AudioSample sound;  
minim = new Minim (this);
sound = minim.loadSample("flap.mp3", 128);
sound.trigger();

//at the very top of your sketch //as a member variable
//as a member variable
//in the setup method
//in the setup method
//in mouseReleased() method (when the bird flaps)