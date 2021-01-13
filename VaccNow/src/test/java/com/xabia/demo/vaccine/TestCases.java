package com.xabia.demo.vaccine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.xabia.demo.vaccine.model.Branch;


public class TestCases extends AbstractTest {
   @Override
   @Before
   public void setUp() {
      super.setUp();
   }
   @Test
   public void getAllBranches() throws Exception {
      String uri = "/vaccnow/branches";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      Branch[] branchlist = super.mapFromJson(content, Branch[].class);
      assertTrue(branchlist.length > 0);
   }
   
   @Test
   public void scheduleVaccination() throws Exception {
      String uri = "/vaccnow/schedulevaccination";
      Map<String, Object> bodyDataMap = new HashMap<String, Object>();
      bodyDataMap.put("branch_id", new Integer(102));
      bodyDataMap.put("vaccine_id", new Integer(1));
      bodyDataMap.put("user_id", new Integer(112));
      bodyDataMap.put("timeslot", "11:00AM-11:15AM");
      String inputJson = super.mapToJson(bodyDataMap);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
         .contentType(MediaType.APPLICATION_JSON_VALUE)
         .content(inputJson)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(201, status);
   }

}