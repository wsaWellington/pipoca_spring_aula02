<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Pessoa</title>
</head>
<body>
	<form action="alterar" method="post">
		<input type="text" name="id" placeholder="Id">
		<input type="text" name="nome" placeholder="Nome">
		<input type="text" name="cpf" placeholder="Cpf">
		<input type="text" name="rg" placeholder="Rg">
		<input type="text" name="telefone" placeholder="Telefone">
		<input type="text" name="email" placeholder="Email">
		<input type="submit">
	</form>

</body>
</html>