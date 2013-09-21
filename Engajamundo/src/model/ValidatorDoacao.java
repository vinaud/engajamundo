package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "doacaoValidator")
public class ValidatorDoacao implements Validator{
	
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object obj) throws ValidatorException {

		if (obj == null || obj.equals(null) || obj.toString().isEmpty())
		{
			FacesMessage msg = new FacesMessage();
            msg.setDetail("Informe o valor da doação!");
            msg.setSummary("Valor da doação não informado");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
		}		
	}

}