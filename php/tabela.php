<?php
echo "<table border=1>";

for ($linha = 1; $linha <= 10; $linha++){
    echo "<tr>";

    for($coluna = 1; $coluna <= 5; $coluna++){
        echo "<td>linha ".$linha. " - coluna".$coluna."<td>";
    }

    echo "</tr>";
}
    echo "</table";
?>