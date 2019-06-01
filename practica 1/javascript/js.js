function pulsar(){
	alert("Encuesta enviada")
}

function mostrar(){
	document.getElementById('obj1').style.display= "obj1";
}

function ocultar(){
	document.getElementById('obj1').style.display= 'none';
}

function mostrar_ocultar(){
	var mensaje = document.getElementById("mensaje");
		if(mensaje.style.display =="none"){
			mostrar();
			document.getElementById("button").value = "mostrar";
		}
		else{
			ocultar();
			document.getElementById("section").value = "ocultar";
		}
}

 