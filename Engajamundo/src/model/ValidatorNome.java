package model;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "nomeValidator")
public class ValidatorNome implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object obj) throws ValidatorException {
		
		String nome = (String) obj;
		if (nome.length() > 50){
			FacesMessage msg = new FacesMessage();
            msg.setDetail("Digite menos do que 50 caracteres");
            msg.setSummary("Limite de caracteres excedido");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
		}

		if (obj == null || obj.equals(null))
		{
			FacesMessage msg = new FacesMessage();
            msg.setDetail("Campo Obrigatório!");
            msg.setSummary("Erro de nome");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
		}
		
		else {
			String n = (String) obj;
			if (!Pattern.matches("[a-zA-Z]+", n))
			{
				FacesMessage msg = new FacesMessage();
				msg.setDetail("Esse campo somente pode conter letras");
		        msg.setSummary("Erro de nome");
		        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		        throw new ValidatorException(msg);
			}
		}
		
	}

	
}