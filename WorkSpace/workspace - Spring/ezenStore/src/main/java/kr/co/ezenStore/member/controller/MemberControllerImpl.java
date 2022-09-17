package kr.co.ezenStore.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.ezenStore.common.base.BaseController;
import kr.co.ezenStore.member.dto.MemberDTO;
import kr.co.ezenStore.member.service.MemberService;

@Controller("memberController")
@RequestMapping(value = "/member")
public class MemberControllerImpl extends BaseController implements MemberController {

	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberDTO memberDTO;
	
	@Override
	@RequestMapping(value = "/addMember.do")
	public ResponseEntity<MemberDTO> addMember(@ModelAttribute("member") MemberDTO _memberDTO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int result = memberService.addMember(_memberDTO);
		ResponseEntity<MemberDTO> resEntity = new ResponseEntity<MemberDTO>(_memberDTO, HttpStatus.OK);
		
		return resEntity;
		
	}

	@Override
	@RequestMapping(value = "/duplicateCheck.do", method = RequestMethod.POST)
	public ResponseEntity<String> duplicateCheck(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String result = memberService.duplicateCheck(id);
		ResponseEntity<String> resEntity = new ResponseEntity<String>(result, HttpStatus.OK);
				
		return resEntity;
	}

}









