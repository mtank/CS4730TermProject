$(document).ready(function() {

  var canvas     =   document.getElementById('cnv'),
      context    =   canvas.getContext('2d'),
      box_size   =   40;
      
  var current_position,
      current_id;
  
  canvas.setAttribute('width', '921');
  canvas.setAttribute('height', '601');

  var canvas_width   =   canvas.width,
      canvas_height  =   canvas.height;

  $('.tool').mousedown(function (e) {
    
    current_id = $(this).attr('id');
    current_position = current_id * 40;

  });

  $('#cnv').mousedown(function (e) {
    
    e.preventDefault();
    position = getPosition(e);

    var cx = (Math.floor(position.x / box_size) * box_size),
        cy = (Math.floor(position.y / box_size) * box_size);

    if (position.x + box_size > canvas_width) {
      cx = canvas_width - box_size;
    }
    if (position.y + box_size > canvas_height) {
      cy = canvas_height - box_size;
    }

    var sprite = new Image();
    sprite.src = "img/Sprite_Sheet.png";

    if (e.ctrlKey || e.metaKey) {
      drawPixel(cx, cy, null, true);
    } else {
      context.drawImage(sprite, current_position, 0, box_size, box_size, cx, cy, box_size, box_size);
    } // if

  });

  function drawPixel(x, y, color, clear) {
    
    if (clear == null) clear = false;
    
    if (clear) {
      context.clearRect(x, y, box_size, box_size);
      context.beginPath();
      context.strokeStyle = 'black';
      context.rect(x, y, box_size, box_size);
      context.stroke();                        
    } else {
      //context.fillRect(x, y, box_size, box_size);
      context.drawImage(image, x, y);
    } // if 

  }; // drawPixel

  function getPosition(e) {
    
    var target;
    
    if (!e) {
      e = window.event;
    }
    
    if (e.target) {
      target = e.target;
    } else if (e.srcElement) {
      target = e.srcElement;
    }
    
    if (target.nodeType == 3) {
      target = target.parentNode;
    }
    
    var x = Math.floor(e.pageX - $(target).offset().left);
    var y = Math.floor(e.pageY - $(target).offset().top);
    return { "x": x, "y": y };

  }; // getPosition

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

  }

  drawGrid();

});