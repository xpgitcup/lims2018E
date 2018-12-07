package lims2018e

class BootStrap {

    def initService
    def commonService

    def init = { servletContext ->
        commonService.webRootPath = servletContext.getRealPath("/")
        environments {
            development {
                println("开发环境...")
                initService.configureForDevelopment(servletContext);
            }
            production {
                println("发布环境...")
                initService.configureForDevelopment(servletContext);
            }
        }
    }
    def destroy = {
    }
}
