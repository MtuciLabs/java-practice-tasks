## Для того чтобы забрать обновления из репозитория, от которого был сделан fork нужно:  
### Сначала нужно добавить ссылку на Upstream репозиторий.
В терминах GitHub, Upstream - это базовый репозиторий, от которого вы делали fork
1. Открыть меню remotes: VCS -> Git -> Remotes...  
  ![picture menu remotes](resources/images/remotes_menu.png?raw=true "Меню remotes")
2. В этом меню нужно добавить ссылку на upstream репозиторий, для этого нажмите `+`.  
3. Откроется окошко _Define remote_. В нем нужно ввести:  
Name: `upstream`  
URL: `https://github.com/MtuciLabs/java-practice-tasks.git`  
И нажать `OK`
  ![picture menu remotes](resources/images/define_remote_window.png?raw=true "Окно Define remote")
4. Результат должен быть как на картинке ниже, только вместо `azamat1554` будет ваш _ник_ в Github:  
  ![picture menu remotes](resources/images/git_remote_window.png?raw=true "Окно Define remote")

### Второй этап - забрать изменения из ветки `upstream/master` в свою ветку `master`
1. Проверить наличие обновлений. Для этого нужно сделать _fetch_ (`Alt + F`). Если ветка `upstream/master` ушла вперед 
(Окно `Version control`, вкладка `Log`), тогда нужно забрать изменения.  
  ![picture menu remotes](resources/images/fetch_menu.png?raw=true "Меню fetch")
2. Проверить, что текущая ветка `master`. Название текущей ветки отображается в правом нижнем углу. Если ветка не `master`, переключитесь на неё.
3. Выбрать из списка веток `upstream/master -> Merge into current`  
  ![picture menu remotes](resources/images/upstream_merge_into_current.png?raw=true "Меню Merge into current")
4. Проверить на вкладке `Log` что ветка `master` обновилась.
