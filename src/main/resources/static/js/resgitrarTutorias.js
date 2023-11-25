$(document).ready(function() {
   // on ready
});


async function registrarTutorias() {
  let datos = {};
  datos.nombre = document.getElementById('txtNombreTutoria').value;
  datos.fechatutoria = document.getElementById('txtFechaTutoria').value;
  datos.horatutoria = document.getElementById('txtHoraTutoria').value;



  const request = await fetch('api/sesion_tutorias', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  alert("La tutoria fue creada con exito");
  window.location.href = 'index.html'

}