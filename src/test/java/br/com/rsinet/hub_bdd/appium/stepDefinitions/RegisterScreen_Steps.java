package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import br.com.rsinet.hub_bdd.appium.screenFactory.RegisterScreen_SOF;
import cucumber.api.java.pt.Quando;

public class RegisterScreen_Steps {

	private RegisterScreen_SOF registerScreen;
	private ContextoDeTeste contextoDeTeste;
	
	public RegisterScreen_Steps(ContextoDeTeste contexto) {
		contextoDeTeste = contexto;
		registerScreen = contextoDeTeste.getScreenObjectManager().getRegisterScreen();
	}
	
	@Quando("^usuario inserir o \"([^\"]*)\"$")
	public void usuario_inserir_o(String usuario) throws Throwable {
		registerScreen.preencheCampoUsuario(usuario);
	}

	@Quando("^inserir seu \"([^\"]*)\"$")
	public void inserir_seu(String email) throws Throwable {
		registerScreen.preencheCampoEmail(email);
	}

	@Quando("^inserir sua \"([^\"]*)\"$")
	public void inserir_sua(String senha) throws Throwable {
		registerScreen.preencheCampoSenha(senha);
	}

	@Quando("^confirmar sua \"([^\"]*)\"$")
	public void confirmar_sua(String senha) throws Throwable {
		registerScreen.preencheCampoConfirmaSenha(senha);
	}
	
	@Quando("^inserir seu primeiro \"([^\"]*)\"$")
	public void inserir_seu_primeiro(String nome) throws Throwable {
		registerScreen.preencheCampoNome(nome);
	}
	
	@Quando("^inserir seu ultimo \"([^\"]*)\"$")
	public void inserir_seu_ultimo(String sobrenome) throws Throwable {
		registerScreen.preencheCampoSobrenome(sobrenome);
	}

	@Quando("^inserir seu numero de \"([^\"]*)\"$")
	public void inserir_seu_numero_de(String telefone) throws Throwable {
		registerScreen.preencheCampoTelefone(telefone);
	}

	@Quando("^selecionar seu \"([^\"]*)\"$")
	public void selecionar_seu(String pais) throws Throwable {
		registerScreen.rolarPaginaParaEndereco();
		registerScreen.selecionaPais(pais);
	}

	@Quando("^inserir seu \"([^\"]*)\" ou provincia$")
	public void inserir_seu_ou_provincia(String estado) throws Throwable {
		registerScreen.preencheCampoEstado(estado);
	}
	
	@Quando("^inserir seu \"([^\"]*)\" com numero")
	public void inserir_seu_com_numero(String endereco) {
		registerScreen.preencheCampoEndereco(endereco);
	}

	@Quando("^inserir a \"([^\"]*)\" que reside$")
	public void inserir_a_que_reside(String cidade) throws Throwable {
		registerScreen.preencheCampoCidade(cidade);
	}

	@Quando("^inserir o \"([^\"]*)\" do seu endereco$")
	public void inserir_o_do_seu_endereco(String cep) throws Throwable {
		registerScreen.preencheCampoCep(cep);
	}

	@Quando("^tocar para realizar seu cadastro$")
	public void tocar_para_realizar_seu_cadastro() throws Throwable {
		registerScreen.redirecionaTela();
		registerScreen.submeteCadastro();
	}

}