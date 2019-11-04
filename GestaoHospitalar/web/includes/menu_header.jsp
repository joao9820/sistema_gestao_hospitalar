
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<header class="my-3">
    <nav class="navbar navbar-expand-sm navbar-light bg-light" >

        <a href="" class="navbar-brand">Farmácia Popular</a>        
        <div class="collapse navbar-collapse d-flex justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a href="/GestaoHospitalar/View/logado/menu.jsp" class="nav-link">Home</a>
                </li>              
                <li class="nav-item">
                    <a href="/GestaoHospitalar/listar_usuarios.jsp" class="nav-link">Usuários</a>
                </li>               
                <li class="nav-item">
                    <a href="/GestaoHospitalar/listar_medicamentos.jsp" class="nav-link">Medicamentos</a>
                </li> <!-- alias da route -->
                <li class="nav-item">
                    <a href="/GestaoHospitalar/cadastro_medicamentos.jsp" class="nav-link">Cadastrar Medicamentos</a>
                </li> <!-- atraves do auth é possivel trazer dados do usuário logado -->
                <!--
                <c:if test="${sessionScope.usuarioLogado.id != null }">
                     <li class="nav-item">
                    <p class="nav-link">${sessionScope.usuarioLogado.nome}</p>
                    </li>
                </c:if> -->
                <li class="nav-item ml-3">
                    <a href="/GestaoHospitalar/logout.jsp?login=0" class="nav-link">Sair</a>
                </li>
      
            </ul>
        </div>
    </nav>
</header>

