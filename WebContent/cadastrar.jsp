<jsp:include page="topo.jsp"></jsp:include>

<!--  El - Expression Laguage -->
${msg }

<form action="cadastrar.html" class="form-group">
	Nome da Cerveja : <input type="text" name="nome" id="nome"
		class="form-control" /> <br>
	<br> Tipo :<input type="text" name="tipo"
		id="tipo" class="form-control" /> <br>
	<br> Nacionalidade :<input type="text" name="pais"
		id="pais" class="form-control" /> <br>
	<br> Avaliação(nota) :<input type="text" name="nota"
		id="nota" class="form-control" /> <br>
	<br> <input type="submit" value="Enviar" id="btn"
		class="btn btn-info" /> 
</form>


<jsp:include page="rodape.jsp"></jsp:include>