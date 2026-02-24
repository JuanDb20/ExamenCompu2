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

        @Override
        public void init(ServletConfig config) throws ServletException {
            super.init(config); // inicializa servlet container
            deviceService =
                    (DeviceService) AppContext.getContext()
                            .getBean("deviceService");
        }

        // Le debo dar al cliente el formulario para que él pueda insertar la información
        @Override
        protected void doGet(HttpServletRequest req,
                             HttpServletResponse resp)
                throws ServletException, IOException {

            req.getRequestDispatcher("/register.html")
                    .forward(req, resp);
        }
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {



            Device device = new Device();

            device.setId(Integer.valueOf(req.getParameter("Id").trim()));
            device.setName(req.getParameter("Name"));
            device.setSerial(req.getParameter("Serial"));
            device.setType(req.getParameter("Type"));
            device.setMaxValue(Double.parseDouble(req.getParameter("MaxValue")));
            device.setMinValue(Double.parseDouble(req.getParameter("MinValue")));
            device.setSamplingPeriod(Long.parseLong(req.getParameter("Sampling Period")));
            device.setTimeTolerance(Long.parseLong(req.getParameter("Time Tolerance")));
            device.setUnit(req.getParameter("Unit"));


            deviceService.saveDevice(device);

            resp.sendRedirect("./Device");
        }
}
