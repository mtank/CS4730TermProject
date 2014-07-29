$(document).ready(function() {

  var canvas     =   document.getElementById('cnv'),
      context    =   canvas.getContext('2d'),
      box_size   =   40,
      width      =   23,
      height     =   15;
      
  var current_position,
      current_id;
  
  canvas.setAttribute('width', '921');
  canvas.setAttribute('height', '601');

  var canvas_width   =   canvas.width,
      canvas_height  =   canvas.height;

  var grid = [1, 2, 1, 1, 1, 2, 2, 2, 1];

  function drawGrid() {

    var p = 0;

    for (var i = 0; i <= canvas.width; i += box_size) {
      context.moveTo(0.5 + i + p, p);
      context.lineTo(0.5 + i + p, canvas.height + p);
    }

    for (var j = 0; j <= canvas.height; j += box_size) {
      context.moveTo(p, 0.5 + j + p);
      context.lineTo(canvas.width + p, 0.5 + j + p);
    }

    context.strokeStyle = "black";
    context.stroke();

  } // drawGrid

  function drawBlocks() {

    var current_block,
        id,
        pos_x,
        pos_y;

    for (i = 0; i < grid.length; i++) {
      
      if (grid[i] != null) {

        pos_x = (i % width) * box_size;
        pos_y = (Math.floor(i / width)) * box_size;
        id = grid[i];
        current_position = id * 40;
        var sprite = new Image();
        sprite.src = "img/Sprite_Sheet.png";

        context.drawImage(sprite, current_position, 0, box_size, box_size, pos_x, pos_y, box_size, box_size);

      } // if

    } // for

  } // drawBlocks

  drawGrid();
  drawBlocks();

});