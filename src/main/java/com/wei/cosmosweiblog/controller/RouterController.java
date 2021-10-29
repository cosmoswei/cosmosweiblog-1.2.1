package com.wei.cosmosweiblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class RouterController {

    @RequestMapping("/login")
    public String test(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       Model model) {
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(token);
//            //login认证通过后，便可拿到shiro保存的用户对象
//            BlogUser blogUser = (BlogUser) subject.getPrincipal();
//            subject.getSession().setAttribute("blogUser", blogUser);
//            return "redirect:/index";
//
//        } catch (UnknownAccountException e) {
//            model.addAttribute("msg", "用户名错误");
//            return "login";
//        } catch (IncorrectCredentialsException e) {
//            model.addAttribute("msg", "密码错误");
//            return "login";
//        } catch (ExcessiveAttemptsException e) {
//            model.addAttribute("msg", "登录失败次数过多");
//            return "login";
//        } catch (LockedAccountException e) {
//            model.addAttribute("msg", "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.");
//            return "login";
//        } catch (DisabledAccountException e) {
//            model.addAttribute("msg", "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.");
//            return "login";
//        } catch (ExpiredCredentialsException e) {
//            model.addAttribute("msg", "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.");
//            return "login";
//        } catch (UnauthorizedException e) {
//            model.addAttribute("msg", "您没有得到相应的授权！" + e.getMessage());
//            return "login";
//        }
        return "index";
    }

    @RequestMapping("/toLogin")
    public String signin() {
        return "login";
    }
    @RequestMapping("/logout")
    public String testLogout(HttpSession httpSession) {
        System.out.println("进入了===》》testLogout" );
        httpSession.invalidate();
        return "index";
    }

    @RequestMapping("/toCommunity")
    public String testCommunity() {
        return "community-list";
    }

}
