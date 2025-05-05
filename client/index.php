<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>Gestione Viaggi</title>
</head>
<body>
    <h1>Gestione Viaggi</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nave</th>
                <th>Porto di Partenza</th>
                <th>Porto di Arrivo</th>
                <th>Data Partenza</th>
                <th>Data Arrivo</th>
            </tr>
        </thead>
        <tbody id="viaggi-table">
            <!-- I dati verranno popolati dinamicamente -->
        </tbody>
    </table>

    <script>
        fetch('/api/viaggi')
            .then(response => response.json())
            .then(data => {
                const tableBody = document.getElementById('viaggi-table');
                data.forEach(viaggio => {
                    const row = document.createElement('tr');
                    row.innerHTML = `
                        <td>${viaggio.id}</td>
                        <td>${viaggio.nave.nome}</td>
                        <td>${viaggio.portoPartenza.nome}</td>
                        <td>${viaggio.portoArrivo.nome}</td>
                        <td>${viaggio.dataPartenza}</td>
                        <td>${viaggio.dataArrivo}</td>
                    `;
                    tableBody.appendChild(row);
                });
            });
    </script>
</body>
</html>
