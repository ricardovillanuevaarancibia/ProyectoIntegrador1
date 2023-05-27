// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarAtendidos();
  $('#espacios').DataTable();
  actualizarEmailDelUsuario();
});

function actualizarEmailDelUsuario() {
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}


async function cargarAtendidos() {
  const request = await fetch('api/espacios', {
    method: 'GET',
    headers: getHeaders()
  });
  const reservas = await request.json();


  let listadoHtml = '';

for (let reserva of reservas) {
    let botonEliminar = '<a href="#"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';



    let reservaHtml = '<tr><td>'+reserva.CasilleroNumero+'</td><td>' + reserva.Departamento +'</td><td>'
                    + reserva.Provincia+'</td><td>'+ reserva.Distrito
                    + '</td><td>' + reserva.Tienda +'</td><td>'

                    +  botonEliminar +'</td></tr>';


    listadoHtml += reservaHtml;
  }

  document.querySelector('#espacios tbody').outerHTML = listadoHtml;
  }

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json'

   };
}

