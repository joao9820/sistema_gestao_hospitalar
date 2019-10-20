# sistema_gestao_hospitalar
Sistema para a matéria de sistema de informação

Galera aqui estão alguns passos para vocês conseguirem clonar o projeto dentro do htdocs do xampp de vocês

Depois de baixar o git, entrem na pasta htdocs no xampp e cliquem com o botão direito irá aparecer a opção git bash

É uma especie de cmd com auxilio de alguns comandos do git:
colem esse código e apertem enter:
git clone https://github.com/joao9820/sistema_gestao_hospitalar.git

após isso o repositório será clonado, fechem o git bash e abram novamente dentro da basta do projeto 'sistema_gestao_hospitalar'

após clonado o projeto já estará atualizado, existirão duas branchs (ramificações) Master(Principal) e Develop(Desenvolvimento)

Ao adicionar ou alterar arquivos na pasta do projeto é necessário incluí-los no repositório (até então as mudanças estarão disponíveis apenas localmente)

Para adicionar as mudanças é simples 

realizem os comandos:

git checkout develop (mudará da branch master para a develop)
OBS: após aparecer ao lado do caminho do projeto (develop) não será mais preciso executar esse comando ao adicionar mudanças

git pull (atualizará o local com o repositório remoto) -- Muito importante para evitar subir codigo desatualizado prejudicando o projeto
git status (lista as alterações realizadas localmente)

Após conferir as mudanças realizadas
git add . (adiciona as alterações)

commita as alterações
git commit -m "Descrição da alteração"

git push (sobe as alterações para o repositório realizando um merge com o que já existe)

git log (lista os últimos commits)
OBS é possível conferir as mudanças no site do git;