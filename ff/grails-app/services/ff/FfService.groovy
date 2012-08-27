package ff

import grails.converters.JSON

class FfService {

    def getPlayersForUser(String id) {
		User requestedUser = User.findByUserName(id)
		
		if(requestedUser)
		{
			return requestedUser.players as JSON
		}

    }
}
