void setup() {
  size(600, 600);
}

void draw() {
 stopSign();
 stopStick();
 crossLine();
}

void stopSign() {
  strokeWeight(1);
  fill(207, 20, 43);
  beginShape();
  vertex(50, 50); // top-left
  vertex(100, 50); // top-right
  vertex(125, 75); // right-top
  vertex(125, 125); // right-bottom
  vertex(100, 150); // bottom-right
  vertex(50, 150); // bottom-left
  vertex(25, 125);
  vertex(25, 75); 
  endShape();
}

void stopStick(){
  line(58, 250, 130, 140);
}
void crossLine() {
  size(600, 600);
  strokeWeight(9); // increases the thickness of the line
line(0, 250, 600, 250); // (the first point, in charge of the orientation)

}

