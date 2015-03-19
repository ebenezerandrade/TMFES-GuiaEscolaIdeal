    <!-- Contato -->


    <section id="contato">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Contato</h2>
                    <hr class="star-primary">
                </div>
            </div>
                   <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <form role="form" action="enviarEmail.jsp" method="post" name="femail" id="femail">
                        <div class="row">
                            <div class="form-group col-xs-12 floating-label-form-group">
                                <label for="nome">Nome</label>
                                <input class="form-control" type="text" name="name" id="name" placeholder="Nome">
                            </div>
                            <div class="form-group col-xs-12 floating-label-form-group">
                                <label for="nome">Assunto</label>
                                <input class="form-control" type="text" name="assunto" placeholder="Assunto">
                            </div>
                        </div>
                      <div class="row">
<div class="form-group col-xs-12 floating-label-form-group">
                                <label for="email">E-mail</label>
                                <input class="form-control" type="email" name="email" placeholder="Email">
            </div>
                    </div>
                        <div class="row">
                            <div class="form-group col-xs-12 floating-label-form-group">
                                <label for="mensagem">Mensagem</label>
                                <textarea name="mensagem" rows="5" class="form-control" id="mensagem" placeholder="Mensagem"></textarea>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="form-group col-xs-12">
                                <button type="submit" class="btn btn-lg btn-success" onclick="return validaContato()">Enviar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
