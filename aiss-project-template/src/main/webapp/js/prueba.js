/**
 * 
 */
var acum = 0;
document.getElementById("addChildren").addEventListener('click',
   function() {
     if(acum < 5){
       var ninos = document.getElementById("niños").value;
       acum = acum + ninos;
       var childrenContainer = document.getElementById("childrenContainer");
       for (var i = 0; i < ninos; i++) {
    	   childrenContainer.appendChild(document.createTextNode("Edad de "  + " niño "));
    	   var input = document.createElement("input");
    	   childrenContainer.appendChild(input);
    	   input.setAttribute('type', 'text');
    	   childrenContainer.appendChild(document.createElement("br"));
       }
     }
   }
);