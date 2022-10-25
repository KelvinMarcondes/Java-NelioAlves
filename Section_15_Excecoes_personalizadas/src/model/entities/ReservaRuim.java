package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaRuim {
	
	private Integer numeroQuarto;
	private Date checkin;
	private  Date checkout;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservaRuim() {
	}

	public ReservaRuim(Integer numeroQuarto, Date checkin, Date checkout) {
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		 long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String atualizaDatas(Date checkin, Date checkout) {
		Date now = new Date();
		if (checkin.before(now)  || checkout.before(now)) {
			return "Data invalida. As datas de atualização devem ser futuras.";
		}
		if(checkin.after(checkout)) {
			return "Data invalida. Checkin precisa ser antes do checkout";
		}
		this.checkin = checkin;
		this.checkout = checkout;
		
		return null;
	}

	@Override
	public String toString() {
		return "Quarto: " + numeroQuarto
				+ ", Checkin: " + sdf.format(checkin)
				+ ", Checkout: " + sdf.format(checkout)
				+ ", " + duration() + " noites";
	}

	
	
	
	
}
