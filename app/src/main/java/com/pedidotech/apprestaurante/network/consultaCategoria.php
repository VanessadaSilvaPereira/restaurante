<?php
	header("Cache-Control: no-cache, no-store, must-revalidate");
	header("Access-Control-Allow-Origin: *");
	header("Content-Type: application/json; charset=utf-8"); 
	
	clearstatcache();
	
	$servidor = 'localhost';
	$usuario  = 'root';
	$senha    = '';
	$banco    = 'restaurante';
	
	try {
		$conecta = new PDO("mysql:host=$servidor;dbname=$banco", $usuario , $senha);
		$conecta->exec("set names utf8");
		$consulta = $conecta->prepare('SELECT * FROM categorias');
		
		$consulta->execute(array());  
		$resultadoDaConsulta = $consulta->fetchAll();
		
		$StringJson = "[";
		
	if ( count($resultadoDaConsulta) ) {
		foreach($resultadoDaConsulta as $registro) {
			
			if ($StringJson != "[") {$StringJson .= ",";}
			
			$StringJson .= '{"id":"' . $registro['id']  . '",';
			$StringJson .= '"nome":"' . $registro['nome']  . '"}';	
			
		}  
		echo $StringJson . "]";
  } 
} catch(PDOException $e) {
    echo 'ERROR: ' . $e->getMessage();
}
?>