<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<br />
	
	<c:if test="${not empty usuarioLogado}">
		<p>Usuário Logado como ${usuarioLogado.email}</p>
	</c:if>
	

	<form action="executa?tarefa=NovaEmpresa" method="post">
		Nome: <input name="nome" type="text" /><br>
		
		<input type="submit" value="Adicionar Nova Empresa" />
	</form>
	
	
	<h2>Login</h2>
	<form action="login" method="post">
		E-mail: <input type="email" name="email" /><br>
		Senha: <input type="password" name="senha"><br>
		<input type="submit" value="Logar" />
	</form>
	
	
	<h2>Logout</h2>
	<form method="post" action="executa">
		<input type="hidden" name="tarefa" value="Logout">
		<input type="submit" value="Deslogar">
	</form>
</body>
</html>