// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarTutorias();
  $('#sesiones_tutoria').DataTable();
});


async function cargarTutorias() {
  const request = await fetch('api/tutorias', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json',
    },
  });
  const SesionTutoria = await request.json();


  let listadoHtml = '';
  for (let tutoria of SesionTutoria) {
    let botonEliminar = '<a href="#" onclick="eliminarTutoria(' + SesionTutoria.id +
     ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

    let tutoriaHtml = '<tr><td>'+SesionTutoria.id+'</td><td>'
                    + SesionTutoria.nombre_tutoria + ' '
                    + SesionTutoria.tutor_id + '</td><td>'
                    + SesionTutoria.fecha+'</td><td>'+ SesionTutoria.hora
                    + '</td><td>' + botonEliminar + '</td></tr>';
    listadoHtml += tutoriaHtml;
  }

document.querySelector('#sesiones_tutoria tbody').outerHTML = listadoHtml;

}