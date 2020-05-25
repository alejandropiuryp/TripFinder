/**
 * 
 */

function checkFecha(){
	const fechaDep = document.getElementById("departureDate").value;
	const fechaRet = document.getElementById("returnDate").value;
	var errFlag = false;
	var errMsg = "";
	var depDate= new Date(fechaDep);
	var retDate= new Date(fechaRet);
	var todayDate = new Date();

	
	if (retDate <= depDate) {
		errMsg += "La fecha de retorno no puede ser anterior o igual a la de salida";
		errFlag= true;
		
	}else if (depDate < todayDate || retDate < todayDate) {
		console.log("hola3");
		errMsg += "Las fechas no pueden ser anteriores a la actual";
		errFlag= true;
	}
	console.log("hola4");
	if(!errFlag) {
	   return true;
	}else {
	   alert(errMsg);
	   return false;
	}	
}