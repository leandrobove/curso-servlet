<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body>
	<h2>Resultado da Busca:</h2>
	<ul>
		<c:forEach var="empresa" items="${empresas }">
			<li>${empresa.id }: ${empresa.nome }</li>
		</c:forEach>
	</ul>
</body>
</html>