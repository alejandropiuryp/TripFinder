//Funciona pero aún no se encuentra implementado

var primera = true;
document.getElementById("addChildren").addEventListener('click',function(){
  var selectN = document.getElementById("childrenNumber").value;
  if(selectN <= 5 && primera){
    var div = document.createElement("div");
    div.setAttribute("id","childrenContainer");
    var childs = document.getElementById("childs");
    childs.appendChild(div);
    var childrenContainer = document.getElementById("childrenContainer");
    primera = false;
    for (var i = 0; i < selectN; i++) {
       var select = document.createElement("select");
      select.setAttribute("name", "selectChildren" + i);
      select.setAttribute("id", "selectChildren" + i);
      for (var j = 0; j <= 17; j++) {
         var option = document.createElement("option");
         option.setAttribute("value", "value");
         option.innerHTML = j;
         select.appendChild(option);
       }
      childrenContainer.appendChild(select);
      childrenContainer.appendChild(document.createElement("br"));
    }
  }
});

document.getElementById("delete").addEventListener('click',function(){
    if(primera == false){
    var container = document.getElementById("childrenContainer");
    container.remove();
    primera = true;
  }
});