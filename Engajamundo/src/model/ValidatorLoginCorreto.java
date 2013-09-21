package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import dao.DaoHibernate;
import dao.IDAO;

@FacesValidator(value = "loginCorretoValidator")
public class ValidatorLoginCorreto implements Validator{

	@Override
	public void validate(FacesContext contexto, UIComponent component, Object value)
			throws ValidatorException {
		IDAO daoEngajador = new DaoHibernate();

		if(!daoEngajador.existeLogin(String.valueOf(value))){
			System.out.println("Excecao DAO");
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "", "Login inexistente");
            throw new ValidatorException(message);
		}
	}

}