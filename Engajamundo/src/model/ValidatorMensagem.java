package model;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@SuppressWarnings("unused")
@FacesValidator(value = "mensagemValidator")
public class ValidatorMensagem implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object obj) throws ValidatorException {
		
		String nome = (String) obj;
		if (nome.length() > 140){
			FacesMessage msg = new FacesMessage();
            msg.setDetail("Digite menos do que 140 caracteres");
            msg.setSummary("Limite de caracteres excedido");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
		}

		if (obj == null || obj.equals(null))
		{
			FacesMessage msg = new FacesMessage();
            msg.setDetail("Digite a mensagem!");
            msg.setSummary("Mensagem em branco");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
		}		
	}

	
}