package cl.acabrera.DTO;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReportOrdersDTO {
	private int orderIdDto;
	private String firstNameStaffDto;
	private String lastNameStaffDto;
	private String firstNameCostumerDto;
	private String lastNameCostumerDto;
	private Date orderDateDto;
	private Date requiredDateDto;
	private int orderStatusDto; 
}
