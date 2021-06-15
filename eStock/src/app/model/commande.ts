import { Lcommande} from '../model/lcommande';
export class Commande {
    id :number;
    numero : number;
    code_client : number;
    lib_client : String;
    date_comm : Date;
    libelle : String;
    totht : number;
    tottva : number;
    totttc : number;
    lcomms :Array<Lcommande> =[];
}