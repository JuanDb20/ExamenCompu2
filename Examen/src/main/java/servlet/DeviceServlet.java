package servlet;

import context.AppContext;
import entity.Device;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.DeviceService;

import java.io.IOException;
import java.io.InputStream;

    @WebServlet("/Device")
    public class DeviceServlet extends HttpServlet {

        private DeviceService deviceService;

}
