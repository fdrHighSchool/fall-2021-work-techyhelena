void setup() {
  size(600, 600);
}
void draw() {
   background();
   stopSign();
   stopStick();
   StreetSide();
   StreetSide2();
   Road();
   Car();
}

void background() {
  background(143, 143, 143); //gray background
}

void stopSign() {
   strokeWeight(3);
   stroke(0,0,0);
   fill(207, 20, 43);
   beginShape();
   vertex(50, 50); // top-left
   vertex(100, 50); // top-right
   vertex(125, 75); // right-top
   vertex(125, 125); // right-bottom
   vertex(100, 150); // bottom-right
   vertex(50, 150); // bottom-left
   vertex(25, 125); // 
   vertex(25, 75); //top-left
   endShape();
   fill(0, 0, 0);
   textSize(38);
   text("STOP", 28,114 );
}

void stopStick(){
 stroke(0,0,0);
 strokeWeight(5); // increases the thickness of the line
 line(75, 250, 75, 155);
}
void StreetSide() {
 size(600, 600);
 strokeWeight(9); // increases the thickness of the line
 line(0, 250, 600, 250); // (the first point, in charge of the orientation)
}
void StreetSide2() {
 fill (143, 143, 143);
 size(600, 600);
 strokeWeight(9); // increases the thickness of the line
 stroke(0,0,0);
 line(0, 500, 600, 500); // (the first point, in charge of the orientation)
}
void Road() {
   fill(36, 36, 36);
   rect(0,250,600,250);
   stroke(250,250,250);
   line(75, 250, 75, 500);
   line(190, 250, 190, 500);
   line(80, 265, 184, 265);
   line(80, 300, 184, 300);
   line(80, 335, 184, 335);
   line(80, 370, 184, 370);
   line(80, 405, 184, 405);
   line(80, 440, 184, 440);
   line(80, 475, 184, 475);
   line(210, 370, 250, 370);//middle line
   line(300, 370, 340, 370);
   line(390, 370, 430, 370);
   line(480, 370, 520, 370);
   line(570, 370, 610, 370);
}
void Car() {
 stroke(0,0,0);
 strokeWeight(1);
 fill(168, 226, 255);
 rect(200, 270, 120, 40);
 rect(230, 230, 70, 40);
 fill(0,0,0);
 rect(235, 240, 60, 30);
 fill(56, 56, 56);
 circle(230, 320, 30);
 circle(300, 320, 30);
 fill(230, 230, 230);
 stroke(230, 230, 230);
 circle(210,300,15);
 fill(255, 0, 0);
 stroke(255, 0, 0);
 circle(315,300,15);
}
