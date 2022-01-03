function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(220);
  //functions
  snowEffect(); 
  lowerBody();
  middle();
  head();
  buttons();
  face();
  scarf(); // optional (messing around)
  snowflake();
  nose();
  hat();
  hand();
}

// idea: snowman with snow falling 
// https://p5js.org/examples/simulate-snowflakes.html
// reference: https://static.vecteezy.com/system/resources/previews/001/760/266/original/cute-cartoon-snowman-vector.jpg
// make snowman with a top hat .. if possible 
function face() {
  strokeWeight(8);
  stroke(0, 0, 0);
  // eyes
  ellipse(158, 135, 3, 3); // left eye
  ellipse(220, 135, 3, 3); // right eye
}

function hat(){
  strokeWeight(1);
  stroke(0,0,0);
  fill(255);
  rect(130 ,75 ,120   ,25  , 20  );
 
  fill(255,12,12);
  triangle(140, 75, 190 , 20, 240  ,75  );
  
  fill(255);
  circle(190, 15, 20);
  
}

function hand(){
  line(115  ,220  , 60  ,  176 );
  line(265 , 220 , 310  , 176);

}

function nose(){
  fill(255,13,13);
  circle(190,160,10);
}


function head() {
  strokeWeight(1);
  stroke(0, 0, 0);
  ellipse(190, 140, 140, 140);

}


function middle() {

  strokeWeight(1);
  stroke(0, 0, 0);
  ellipse(190, 225, 150, 150); 

}


function lowerBody() {
  strokeWeight(1);
  stroke(0, 0, 0);
  ellipse(190, 310, 169, 169);
  // fill(245, 244, 244);
  
}

// accessories on the snowman 
function buttons() {
  strokeWeight(12);
  stroke(130, 88, 27);
  //top one (middle portion)
  ellipse(190, 230, 12, 12);
  //bot one (middle portion)
  ellipse(190, 280, 12, 12);
  //top one (bottom portion)
  ellipse(190, 330, 12, 12);
}

function scarf() {
  noStroke();
  fill(208, 83, 58);
  rect(109, 178, 160, 35, 100);
  // bottom part sticking out 
  rect(220, 190, 25, 100, 100);
}

//SNOWFLAKE LIBRARY
let snowflakes = []; // array to hold snowflake objects

function snowEffect() {
  noStroke();
  background(201, 224, 225); // background color 
  fill(255, 255, 255); // snowflake color 
  
  let t = frameCount / 60; // update time

  // create a random number of snowflakes each frame
  for (let i = 0; i < random(1); i++) {
    snowflakes.push(new snowflake()); // append snowflake object
  }

  // loop through snowflakes with a for..of loop
  for (let flake of snowflakes) {
    flake.update(t); // update snowflake position
    flake.display(); // draw snowflake
  }
}

// snowflake class
function snowflake() {
  // initialize coordinates
  this.posX = 0;
  this.posY = random(-50, 0);
  this.initialangle = random(0, 2 * PI);
  this.size = random(2, 5);

  // radius of snowflake spiral
  // chosen so the snowflakes are uniformly spread out in area
  this.radius = sqrt(random(pow(width / 2, 2)));

  this.update = function(time) {
    // x position follows a circle
    let w = 0.1; // angular speed
    let angle = w * time + this.initialangle;
    this.posX = width / 2 + this.radius * sin(angle);

    // different size snowflakes fall at slightly different y speeds
    this.posY += pow(this.size, 0.5);

    // delete snowflake if past end of screen
    if (this.posY > height) {
      let index = snowflakes.indexOf(this);
      snowflakes.splice(index, 1);
    }
  };

  this.display = function() {
    ellipse(this.posX, this.posY, this.size);
  };
}
