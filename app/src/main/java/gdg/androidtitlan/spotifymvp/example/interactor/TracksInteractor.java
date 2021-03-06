/**
 * Copyright 2015 Erik Jhordan Rey.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gdg.androidtitlan.spotifymvp.example.interactor;

import gdg.androidtitlan.spotifymvp.example.data.api.client.SpotifyService;
import gdg.androidtitlan.spotifymvp.example.data.model.Track;
import io.reactivex.Observable;
import java.util.List;

public class TracksInteractor {

  private SpotifyService spotifyService;

  public TracksInteractor(SpotifyService spotifyService) {
    this.spotifyService = spotifyService;
  }

  public Observable<List<Track>> loadData(String artistId) {
    return spotifyService.getTracks(artistId);
  }
}
