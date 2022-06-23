import { DataState } from "../enum/data-status.enum";

export interface AppState<T> {
    dataState: DataState;
    appData?: T;
    error?: string;
}