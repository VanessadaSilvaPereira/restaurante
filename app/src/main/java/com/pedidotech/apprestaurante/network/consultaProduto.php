<?php
	header("Cache-Control: no-cache, no-store, must-revalidate"); // limpa o cache
	header("Access-Control-Allow-Origin: *");
	header("Content-Type: application/json; charset=utf-8"); 
	
	clearstatcache(); // limpa o cache
        // Dados do servidor de banco de Dados, neste exemplo uso Hostinger.
	$servidor = 'localhost';//?
	$usuario  = 'root';
	$senha    = '';
	$banco    = 'restaurante';
	
	try {
		$conecta = new PDO("mysql:host=$servidor;dbname=$banco", $usuario , $senha);
		$conecta->exec("set names utf8"); //permite caracteres latinos.
		$consulta = $conecta->prepare('SELECT * FROM produtos');
		
		$consulta->execute(array());  
		$resultadoDaConsulta = $consulta->fetchAll();
		
		$StringJson = "[";
		
	if ( count($resultadoDaConsulta) ) {
		foreach($resultadoDaConsulta as $registro) {
			
			if ($StringJson != "[") {$StringJson .= ",";}
			
			$StringJson .= '{"id":"' . $registro['id']  . '",';
			$StringJson .= '"nome":"' . $registro['nome']  . '",';	
			$StringJson .= '"preco":"' . $registro['preco']    . '",';
			$StringJson .= '"descricao":"' . $registro['descricao']    . '",';
			$StringJson .= '"foto":"' . $registro['foto']    . '",';
			$StringJson .= '"codIngrediente":"' . $registro['codIngrediente']    . '",';
			$StringJson .= '"codCategoria":"' . $registro['codCategoria']    . '"}';		
		}  
		echo $StringJson . "]"; // Exibe o vettor JSON
  } 
} catch(PDOException $e) {
    echo 'ERROR: ' . $e->getMessage(); // opcional, apenas para teste
}
?>