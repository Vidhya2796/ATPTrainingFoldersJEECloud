package com.vidhyac.emp.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vidhyac.emp.service.EmployeeService;

@Path("employee")
public class EmployeeResource {
	private EmployeeService service;

	/*
	 * public EmployeeService getService() { return service; } public void
	 * setService(EmployeeService service) { this.service = service; }
	 */

	public EmployeeResource() {
		service = new EmployeeService();
	}

	/*@Path("{id}/{name}/{dept}/{design}/{sal}")*/
	/*@Path("{id}")*/
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String addEmployeeCont(@FormParam("id") long empId, @FormParam("name") String empName,
			@FormParam("dept") String empDept, @FormParam("design") String empDesign, @FormParam("sal") Double empSal) {

		return service.addEmployeeSer(empId, empName, empDept, empDesign, empSal);

	}

}
