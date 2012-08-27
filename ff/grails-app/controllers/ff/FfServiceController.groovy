package ff

class FfServiceController {

	def ffService
	
    def index() { }
	
	def getPlayers()
	{
		render ffService.getPlayersForUser(params.id)
	}
}
