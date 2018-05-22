<jsp:include page="topo.jsp"></jsp:include>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

	<h3 class="page-header">BUSCAR CERVEJA</h3>
	
	<div class="well">
		<form action="buscar.html" method="post">
			<div class="form-group">
				Informe o nome:
				<!-- O valoue do campo com EL nome é para manter o valor 
				utilizado na busca depois de clicar -->
				<input type="text" name="nome" value="${nome }" class="form-control"> 
			</div>
			<input type="submit" value="BUSCAR" class="btn btn-info">
		</form>
		${msg }
	</div>
	
	<c:if test="${fn:length(lista) > 0 }">
		<table class="table table-bordered">
			<tr>
				<th>NOME</th>
				<th>NOTA</th>
				<th>PAIS</th>
				<th>TIPO</th>
				<th></th>
			</tr>
			<c:forEach items="${lista }" var="f">
				<tr>
					<td>${f.nome }</td>
					<td>${f.nota }</td>
					<td>${f.pais }</td>
					<td>${f.tipo}</td>
						
					
					<td>
						
					</td>
					<td>
						<a href="editar.html?id=${f.idcerveja }" class="btn btn-warning">Editar</a>
						<a href="excluir.html?id=${f.idcerveja }" 
						onclick="return confirm('Deseja excluir esta Cerveja?')" 
								class="btn btn-danger">Excluir</a>
					</td>
				</tr>
			</c:forEach>
	</table>
	</c:if>
		
<jsp:include page="rodape.jsp"></jsp:include>